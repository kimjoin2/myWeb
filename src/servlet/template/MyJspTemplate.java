package servlet.template;

import servlet.directory.DefaultDirectory;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * template for bumskim's design
 * @author bumskim
 * @version 1.0.0
 */
public class MyJspTemplate {

    //for main jsp file
    private String templatePage;

    //parts of design
    private String head;
    private String leftBody;
    private String centerBody;
    private String rightBody;
    private String bottom;

    //request, response servlet object
    private HttpServletRequest request;
    private HttpServletResponse response;

    /**
     *
     * basic constructor - no parameter
     * set default except for the servlet objects
     */
    public MyJspTemplate() {
        setDefault();
    }

    /**
     *
     * constructor with servlet objects
     * set default
     * @param request servlet request object
     * @param response serlvet response object
     */
    public MyJspTemplate(HttpServletRequest request, HttpServletResponse response) {

        this();

        this.request = request;
        this.response = response;
    }

    /**
     * constructor with servlets and center-body
     * others are default
     * @param request servlet request object
     * @param response servlet response object
     * @param centerBody set center-body's jsp file
     */
    public MyJspTemplate(HttpServletRequest request, HttpServletResponse response,
                         String centerBody) {
        this(request, response);

        this.centerBody = centerBody;
    }

    /**
     *
     * constructor with all fields
     *
     * @param request servlet request object
     * @param response servlet response object
     * @param head set head's jsp file
     * @param leftBody set leftBody's jsp file
     * @param centerBody set centerBody's jsp file
     * @param rightBody set rightBody's jsp file
     * @param bottom set bottom's jsp file
     */
    public MyJspTemplate(HttpServletRequest request, HttpServletResponse response,
                         String head,
                         String leftBody,
                         String centerBody,
                         String rightBody,
                         String bottom) {

        this(request, response, centerBody);

        this.head = head;
        this.leftBody = leftBody;
        this.rightBody = rightBody;
        this.bottom = bottom;
    }

    /**
     *
     * set default this object except for servlet objects
     */
    private void setDefault() {
        head = "templateHead.jsp";
        leftBody = "templateLeftBody.jsp";
        centerBody = "templateCenterBody.jsp";
        rightBody = "templateRightBody.jsp";
        bottom = "templateBottom.jsp";
        templatePage = "/" + DefaultDirectory.JSP + "template.jsp";
    }

    /**
     *
     * do forward by object's request object and fields
     */
    public void doForward() {

        RequestDispatcher result = null;

        try {
            request.setAttribute("head", head);
            request.setAttribute("leftBody", leftBody);
            request.setAttribute("rightBody", rightBody);
            request.setAttribute("centerBody", centerBody);
            request.setAttribute("bottom", bottom);
            request.getRequestDispatcher(templatePage).forward(request, response);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
