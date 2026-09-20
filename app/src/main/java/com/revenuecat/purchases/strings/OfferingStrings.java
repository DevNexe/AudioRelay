package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes3.dex */
public final class OfferingStrings {
    public static final String CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR = "Could not find SkuDetails for %s \nThere is a problem with your configuration in Play Store Developer Console. More info here: https://errors.rev.cat/configuring-products";
    public static final String CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS = "There are no products registered in the RevenueCat dashboard for your offerings. If you don't want to use the offerings system, you can safely ignore this message. To configure offerings and their products, follow the instructions in https://rev.cat/how-to-configure-offerings.\nMore information: https://rev.cat/why-are-offerings-empty";
    public static final String CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND = "There's a problem with your configuration. None of the products registered in the RevenueCat dashboard could be fetched from the Play Store.\nMore information: https://rev.cat/why-are-offerings-empty";
    public static final String EMPTY_SKU_LIST = "SKU list is empty, skipping querySkuDetailsAsync call";
    public static final String EXTRA_QUERY_SKU_DETAILS_RESPONSE = "BillingClient querySkuDetails has returned more than once, with result: %s. More info here: https://rev.cat/google-duplicated-listener-timeouts";
    public static final String FETCHING_OFFERINGS_ERROR = "Error fetching offerings - %s";
    public static final String FETCHING_PRODUCTS = "Requesting products from the store with identifiers: %s";
    public static final String FETCHING_PRODUCTS_ERROR = "Error when fetching products %s";
    public static final String FETCHING_PRODUCTS_FINISHED = "Products request finished for %s";
    public static final OfferingStrings INSTANCE = new OfferingStrings();
    public static final String JSON_EXCEPTION_ERROR = "JSONException when building Offerings object. Message: %s";
    public static final String LIST_PRODUCTS = "%s - %s";
    public static final String NO_CACHED_OFFERINGS_FETCHING_NETWORK = "No cached Offerings, fetching from network";
    public static final String OFFERINGS_STALE_UPDATING_IN_BACKGROUND = "Offerings cache is stale, updating from network in background";
    public static final String OFFERINGS_STALE_UPDATING_IN_FOREGROUND = "Offerings cache is stale, updating from network in foreground";
    public static final String OFFERINGS_UPDATED_FROM_NETWORK = "Offerings updated from network.";
    public static final String OFFERING_EMPTY = "There's a problem with your configuration. No packages could be found for offering with identifier %s. This could be due to Products not being configured correctly in the RevenueCat dashboard or Play Store.\nTo configure products, follow the instructions in https://rev.cat/how-to-configure-offerings.\nMore information: https://rev.cat/why-are-offerings-empty";
    public static final String RETRIEVED_PRODUCTS = "Retrieved skuDetailsList: %s";
    public static final String VENDING_OFFERINGS_CACHE = "Vending Offerings from cache";

    private OfferingStrings() {
    }
}
