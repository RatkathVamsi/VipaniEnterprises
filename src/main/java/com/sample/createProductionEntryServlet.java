package com.sample;

import com.sample.model.LiquorType;
import com.sample.model.ProductionEntry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet(
        name = "createProductionEntryservlet",
        urlPatterns = "/createProductionEntry"
)
public class createProductionEntryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductionEntry productionEntry= new ProductionEntry();

        productionEntry.setGST(req.getParameter("GST"));
        productionEntry.setConsumptionQties(req.getParameterValues("consumptionQty"));
        productionEntry.setProcessingRate(req.getParameter("processingRate"));
        productionEntry.setUdCakeQty(req.getParameter("udCake"));

        System.out.println(productionEntry.toString());
    }
}





/*public class SelectLiquorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String liquorType = req.getParameter("Type");
        System.out.println("Liquor Type= "+ liquorType);
        LiquorService liquorService = new LiquorService();
        LiquorType l = LiquorType.valueOf(liquorType);

        List liquorBrands = liquorService.getAvailableBrands(l);

        req.setAttribute("brands", liquorBrands);
        RequestDispatcher view = req.getRequestDispatcher("Result.jsp");
        view.forward(req, resp);

    }
}
*/
