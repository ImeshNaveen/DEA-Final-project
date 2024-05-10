<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page import="productPackege.Product, productPackege.ProductDAO" %>
<div class="account__wrapper">
                        <div class="account__content">
                            <h2 class="account__content--title h3 mb-20">Orders History</h2>
                            <div class="account__table--area">
                                <table class="account__table">
                                    <thead class="account__table--header">
                                        <tr class="account__table--header__child">
                                            <th class="account__table--header__child--items">Product</th>
                                            <th class="account__table--header__child--items">Description</th>
                                            <th class="account__table--header__child--items">condition</th>
                                            <th class="account__table--header__child--items">year</th>
                                            <th class="account__table--header__child--items">price</th>	 
                                            <th class="account__table--header__child--items">Action</th>	 
                                        </tr>
                                    </thead>
                                    <tbody class="account__table--body mobile__none">
                                        <% 
                                                    Product product = null;
                                                    List<Product> productList = null;
                                                    
                                                    if(request.getParameter("deleteId") == null){
                                                        System.out.println("deleteId not set");
                                                    }else{
                                                        int deleteId = Integer.parseInt(request.getParameter("deleteId"));
                                                        boolean value = ProductDAO.deleteProduct(deleteId);
                                                        
                                                    }
                                                    
                                                    if(request.getParameter("catId") == null){
                                                        productList = ProductDAO.selectProducts();
                                                    }else{
                                                        int id = Integer.parseInt(request.getParameter("catId"));
                                                        productList = ProductDAO.selectProducts(id);
                                                    }
                                                    
                                                    for(Product prod: productList){
                                                %>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items"><%= prod.getName() %></td>
                                            <td class="account__table--body__child--items"><%= prod.getDescription() %></td>
                                            <td class="account__table--body__child--items"><%= prod.getItemCondition() %></td>
                                            <td class="account__table--body__child--items"><%= prod.getYear() %></td>
                                            <td class="account__table--body__child--items"><%= prod.getPrice() %></td>
                                            <td class="account__table--body__child--items">
                                                <a href="?deleteId="><button>Delete</button></a>
                                                <a href="?editId="><button>Edit</button></a>
                                            </td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                    </tbody>
                                    <tbody class="account__table--body mobile__block">
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                        <tr class="account__table--body__child">
                                            <td class="account__table--body__child--items">
                                                <strong>Order</strong>
                                                <span>#2014</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Date</strong>
                                                <span>November 24, 2022</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Payment Status</strong>
                                                <span>Paid</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Fulfillment Status</strong>
                                                <span>Unfulfilled</span>
                                            </td>
                                            <td class="account__table--body__child--items">
                                                <strong>Total</strong>
                                                <span>$40.00 USD</span>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>