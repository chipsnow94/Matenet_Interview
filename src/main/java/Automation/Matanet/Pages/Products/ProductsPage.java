package Automation.Matanet.Pages.Products;

public class ProductsPage {
	private ProductsPageController act;

	private ProductsPage(ProductsPageController act) {
		this.act = act;
	}

	public ProductsPageController act() {
		return act;
	}

	public static ProductsPage getProductsPage() {
		return new ProductsPage(new ProductsPageController());
	}
}
