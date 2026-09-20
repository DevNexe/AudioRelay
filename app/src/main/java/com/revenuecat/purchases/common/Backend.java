package com.revenuecat.purchases.common;

import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.ds0;
import defpackage.i5;
import defpackage.j81;
import defpackage.oV9;
import defpackage.ps0;
import defpackage.sd5;
import defpackage.t92;
import defpackage.uy2;
import defpackage.wu;
import defpackage.x81;
import defpackage.y81;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Backend {
    private final String apiKey;
    private final Map<String, String> authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<uy2<j81<CustomerInfo, sd5>, j81<PurchasesError, sd5>>>> callbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<uy2<x81<CustomerInfo, JSONObject, sd5>, y81<PurchasesError, Boolean, JSONObject, sd5>>>> postReceiptCallbacks = new LinkedHashMap();
    private volatile Map<String, List<uy2<j81<JSONObject, sd5>, j81<PurchasesError, sd5>>>> offeringsCallbacks = new LinkedHashMap();
    private volatile Map<List<String>, List<uy2<x81<CustomerInfo, Boolean, sd5>, j81<PurchasesError, sd5>>>> identifyCallbacks = new LinkedHashMap();

    public Backend(String str, Dispatcher dispatcher, HTTPClient hTTPClient) {
        this.apiKey = str;
        this.dispatcher = dispatcher;
        this.httpClient = hTTPClient;
        this.authenticationHeaders = Collections.singletonMap("Authorization", "Bearer " + str);
    }

    private final <K, S, E> void addCallback(Map<K, List<uy2<S, E>>> map, Dispatcher.AsyncCall asyncCall, K k, uy2<? extends S, ? extends E> uy2Var, boolean z) {
        if (map.containsKey(k)) {
            LogUtilsKt.debugLog(String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k}, 1)));
            map.get(k).add(uy2Var);
        } else {
            map.put(k, ps0.P(uy2Var));
            enqueue(asyncCall, z);
        }
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Object obj, uy2 uy2Var, boolean z, int i, Object obj2) {
        backend.addCallback(map, asyncCall, obj, uy2Var, (i & 8) != 0 ? false : z);
    }

    private final String encode(String str) {
        return Uri.encode(str);
    }

    private final void enqueue(Dispatcher.AsyncCall asyncCall, boolean z) {
        if (this.dispatcher.isClosed()) {
            return;
        }
        this.dispatcher.enqueue(asyncCall, z);
    }

    public static /* synthetic */ void enqueue$default(Backend backend, Dispatcher.AsyncCall asyncCall, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        backend.enqueue(asyncCall, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSuccessful(HTTPResult hTTPResult) {
        return hTTPResult.getResponseCode() < 300;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final Map<String, String> getAuthenticationHeaders$common_latestDependenciesRelease() {
        return this.authenticationHeaders;
    }

    public final synchronized Map<List<String>, List<uy2<j81<CustomerInfo, sd5>, j81<PurchasesError, sd5>>>> getCallbacks() {
        return this.callbacks;
    }

    public final void getCustomerInfo(String str, boolean z, j81<? super CustomerInfo, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        List listV0;
        final List list;
        final String str2 = "/subscribers/" + encode(str);
        synchronized (this) {
            if (this.postReceiptCallbacks.isEmpty()) {
                listV0 = Collections.singletonList(str2);
            } else {
                listV0 = wu.V0(String.valueOf(this.callbacks.size()), Collections.singletonList(str2));
            }
            list = listV0;
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, str2, null, this.this$0.getAuthenticationHeaders$common_latestDependenciesRelease(), false, 8, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<uy2<j81<CustomerInfo, sd5>, j81<PurchasesError, sd5>>> listRemove;
                Backend backend = this.this$0;
                List<String> list2 = list;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        uy2 uy2Var = (uy2) it.next();
                        j81 j81Var3 = (j81) uy2Var.w;
                        j81 j81Var4 = (j81) uy2Var.x;
                        try {
                            if (backend2.isSuccessful(hTTPResult)) {
                                j81Var3.invoke(CustomerInfoFactoriesKt.buildCustomerInfo(hTTPResult.getBody()));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                j81Var4.invoke(purchasesError);
                            }
                        } catch (JSONException e) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e);
                            LogUtilsKt.errorLog(purchasesError2);
                            j81Var4.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<uy2<j81<CustomerInfo, sd5>, j81<PurchasesError, sd5>>> listRemove;
                Backend backend = this.this$0;
                List<String> list2 = list;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((j81) ((uy2) it.next()).x).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.callbacks, asyncCall, list, new uy2(j81Var, j81Var2), z);
            sd5 sd5Var = sd5.a;
        }
    }

    public final synchronized Map<List<String>, List<uy2<x81<CustomerInfo, Boolean, sd5>, j81<PurchasesError, sd5>>>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String str, boolean z, j81<? super JSONObject, sd5> j81Var, j81<? super PurchasesError, sd5> j81Var2) {
        final String strB = i5.b(new StringBuilder("/subscribers/"), encode(str), "/offerings");
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, strB, null, this.this$0.getAuthenticationHeaders$common_latestDependenciesRelease(), false, 8, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) throws JSONException {
                List<uy2<j81<JSONObject, sd5>, j81<PurchasesError, sd5>>> listRemove;
                Backend backend = this.this$0;
                String str2 = strB;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(str2);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        uy2 uy2Var = (uy2) it.next();
                        j81 j81Var3 = (j81) uy2Var.w;
                        j81 j81Var4 = (j81) uy2Var.x;
                        if (backend2.isSuccessful(hTTPResult)) {
                            try {
                                j81Var3.invoke(hTTPResult.getBody());
                            } catch (JSONException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                j81Var4.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(hTTPResult);
                            LogUtilsKt.errorLog(purchasesError2);
                            j81Var4.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<uy2<j81<JSONObject, sd5>, j81<PurchasesError, sd5>>> listRemove;
                Backend backend = this.this$0;
                String str2 = strB;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(str2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((j81) ((uy2) it.next()).x).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.offeringsCallbacks, asyncCall, strB, new uy2(j81Var, j81Var2), z);
            sd5 sd5Var = sd5.a;
        }
    }

    public final synchronized Map<String, List<uy2<j81<JSONObject, sd5>, j81<PurchasesError, sd5>>>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<uy2<x81<CustomerInfo, JSONObject, sd5>, y81<PurchasesError, Boolean, JSONObject, sd5>>>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final void logIn(final String str, final String str2, x81<? super CustomerInfo, ? super Boolean, sd5> x81Var, j81<? super PurchasesError, sd5> j81Var) {
        final ArrayList arrayListE0 = oV9.e0(new String[]{str, str2});
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, "/subscribers/identify", t92.Q(new uy2("new_app_user_id", str2), new uy2("app_user_id", str)), this.this$0.getAuthenticationHeaders$common_latestDependenciesRelease(), false, 8, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) throws JSONException {
                List<uy2<x81<CustomerInfo, Boolean, sd5>, j81<PurchasesError, sd5>>> listRemove;
                if (!this.this$0.isSuccessful(hTTPResult)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this.this$0;
                List<String> list = arrayListE0;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        uy2 uy2Var = (uy2) it.next();
                        x81 x81Var2 = (x81) uy2Var.w;
                        j81 j81Var2 = (j81) uy2Var.x;
                        boolean z = hTTPResult.getResponseCode() == 201;
                        if (hTTPResult.getBody().length() > 0) {
                            x81Var2.invoke(CustomerInfoFactoriesKt.buildCustomerInfo(hTTPResult.getBody()), Boolean.valueOf(z));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            j81Var2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<uy2<x81<CustomerInfo, Boolean, sd5>, j81<PurchasesError, sd5>>> listRemove;
                Backend backend = this.this$0;
                List<String> list = arrayListE0;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((j81) ((uy2) it.next()).x).invoke(purchasesError);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, asyncCall, arrayListE0, new uy2(x81Var, j81Var), false, 8, null);
            sd5 sd5Var = sd5.a;
        }
    }

    public final void performRequest(final String str, final Map<String, ? extends Object> map, final j81<? super PurchasesError, sd5> j81Var, final y81<? super PurchasesError, ? super Integer, ? super JSONObject, sd5> y81Var) {
        enqueue$default(this, new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend.performRequest.1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(Backend.this.httpClient, str, map, Backend.this.getAuthenticationHeaders$common_latestDependenciesRelease(), false, 8, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) throws JSONException {
                PurchasesError purchasesError;
                if (Backend.this.isSuccessful(hTTPResult)) {
                    purchasesError = null;
                } else {
                    purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError);
                }
                y81Var.invoke(purchasesError, Integer.valueOf(hTTPResult.getResponseCode()), hTTPResult.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                j81Var.invoke(purchasesError);
            }
        }, false, 2, null);
    }

    public final void postReceiptData(String str, String str2, boolean z, boolean z2, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str3, String str4, x81<? super CustomerInfo, ? super JSONObject, sd5> x81Var, y81<? super PurchasesError, ? super Boolean, ? super JSONObject, sd5> y81Var) {
        final Map mapFilterNotNullValues;
        String price;
        final ArrayList arrayListE0 = oV9.e0(new String[]{str, str2, String.valueOf(z), String.valueOf(z2), map.toString(), receiptInfo.toString(), str3});
        uy2[] uy2VarArr = new uy2[13];
        uy2VarArr[0] = new uy2("fetch_token", str);
        uy2VarArr[1] = new uy2("product_ids", receiptInfo.getProductIDs());
        uy2VarArr[2] = new uy2("app_user_id", str2);
        uy2VarArr[3] = new uy2("is_restore", Boolean.valueOf(z));
        uy2VarArr[4] = new uy2("presented_offering_identifier", receiptInfo.getOfferingIdentifier());
        uy2VarArr[5] = new uy2("observer_mode", Boolean.valueOf(z2));
        uy2VarArr[6] = new uy2(InAppPurchaseMetaData.KEY_PRICE, receiptInfo.getPrice());
        uy2VarArr[7] = new uy2(InAppPurchaseMetaData.KEY_CURRENCY, receiptInfo.getCurrency());
        uy2VarArr[8] = new uy2("attributes", !map.isEmpty() ? map : null);
        uy2VarArr[9] = new uy2("normal_duration", receiptInfo.getDuration());
        uy2VarArr[10] = new uy2("intro_duration", receiptInfo.getIntroDuration());
        uy2VarArr[11] = new uy2("trial_duration", receiptInfo.getTrialDuration());
        uy2VarArr[12] = new uy2("store_user_id", str3);
        Map mapQ = t92.Q(uy2VarArr);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapQ.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        if (storeProduct == null || (price = storeProduct.getPrice()) == null || (mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(t92.Q(new uy2("price_string", price), new uy2("marketplace", str4)))) == null) {
            mapFilterNotNullValues = ds0.w;
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, "/receipts", linkedHashMap, t92.S(this.this$0.getAuthenticationHeaders$common_latestDependenciesRelease(), mapFilterNotNullValues), false, 8, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                List<uy2<x81<CustomerInfo, JSONObject, sd5>, y81<PurchasesError, Boolean, JSONObject, sd5>>> listRemove;
                Backend backend = this.this$0;
                List<String> list = arrayListE0;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        uy2 uy2Var = (uy2) it.next();
                        x81 x81Var2 = (x81) uy2Var.w;
                        y81 y81Var2 = (y81) uy2Var.x;
                        try {
                            if (backend2.isSuccessful(hTTPResult)) {
                                x81Var2.invoke(CustomerInfoFactoriesKt.buildCustomerInfo(hTTPResult.getBody()), hTTPResult.getBody());
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                                LogUtilsKt.errorLog(purchasesError);
                                y81Var2.invoke(purchasesError, Boolean.valueOf(hTTPResult.getResponseCode() < 500 && purchasesError.getCode() != PurchasesErrorCode.UnsupportedError), hTTPResult.getBody());
                            }
                        } catch (JSONException e) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e);
                            LogUtilsKt.errorLog(purchasesError2);
                            y81Var2.invoke(purchasesError2, Boolean.FALSE, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                List<uy2<x81<CustomerInfo, JSONObject, sd5>, y81<PurchasesError, Boolean, JSONObject, sd5>>> listRemove;
                Backend backend = this.this$0;
                List<String> list = arrayListE0;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((y81) ((uy2) it.next()).x).invoke(purchasesError, Boolean.FALSE, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, arrayListE0, new uy2(x81Var, y81Var), false, 8, null);
            sd5 sd5Var = sd5.a;
        }
    }

    public final synchronized void setCallbacks(Map<List<String>, List<uy2<j81<CustomerInfo, sd5>, j81<PurchasesError, sd5>>>> map) {
        this.callbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<uy2<x81<CustomerInfo, Boolean, sd5>, j81<PurchasesError, sd5>>>> map) {
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<String, List<uy2<j81<JSONObject, sd5>, j81<PurchasesError, sd5>>>> map) {
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<uy2<x81<CustomerInfo, JSONObject, sd5>, y81<PurchasesError, Boolean, JSONObject, sd5>>>> map) {
        this.postReceiptCallbacks = map;
    }
}
