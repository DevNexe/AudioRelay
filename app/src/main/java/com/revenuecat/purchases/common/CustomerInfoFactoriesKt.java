package com.revenuecat.purchases.common;

import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.Iso8601Utils;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import defpackage.ba4;
import defpackage.hs0;
import defpackage.iv4;
import defpackage.na4;
import defpackage.t92;
import defpackage.ur1;
import defpackage.x94;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerInfoFactoriesKt {
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    public static final CustomerInfo buildCustomerInfo(JSONObject jSONObject) throws JSONException {
        EntitlementInfos entitlementInfos;
        Date date;
        Set setSingleton;
        Set set;
        JSONObject jSONObject2 = jSONObject.getJSONObject("subscriber");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("non_subscriptions");
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> itKeys = jSONObject3.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject3.getJSONArray(next);
            int length = jSONArray.length();
            if (length > 0) {
                jSONObject4.put(next, jSONArray.getJSONObject(length - 1));
            }
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject("subscriptions");
        Map<String, Date> expirations = JSONObjectExtensionsKt.parseExpirations(jSONObject5);
        LinkedHashMap linkedHashMapS = t92.S(JSONObjectExtensionsKt.parsePurchaseDates(jSONObject5), JSONObjectExtensionsKt.parsePurchaseDates(jSONObject4));
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("entitlements");
        Date date2 = Iso8601Utils.parse(jSONObject.getString("request_date"));
        Date date3 = Iso8601Utils.parse(jSONObject2.getString("first_seen"));
        if (jSONObjectOptJSONObject == null || (entitlementInfos = EntitlementInfoFactoriesKt.buildEntitlementInfos(jSONObjectOptJSONObject, jSONObject5, jSONObject4, date2)) == null) {
            entitlementInfos = new EntitlementInfos(Collections.emptyMap());
        }
        String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObject2, "management_url");
        String strOptNullableString2 = JSONObjectExtensionsKt.optNullableString(jSONObject2, "original_purchase_date");
        if (strOptNullableString2 != null) {
            Date date4 = Iso8601Utils.parse(strOptNullableString2);
            if (date4 == null) {
                date4 = null;
            }
            date = date4;
        } else {
            date = null;
        }
        x94 x94VarF0 = ba4.F0(jSONObject3.keys());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        na4.K0(x94VarF0, linkedHashSet);
        int size = linkedHashSet.size();
        if (size != 0) {
            if (size == 1) {
                set = linkedHashSet;
                setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            }
            set = linkedHashSet;
            return new CustomerInfo(entitlementInfos, set, expirations, linkedHashMapS, date2, jSONObject, jSONObject.optInt("schema_version"), date3, jSONObject2.optString("original_app_user_id"), strOptNullableString != null ? Uri.parse(strOptNullableString) : null, date);
        }
        setSingleton = hs0.w;
        set = setSingleton;
        set = linkedHashSet;
        return new CustomerInfo(entitlementInfos, set, expirations, linkedHashMapS, date2, jSONObject, jSONObject.optInt("schema_version"), date3, jSONObject2.optString("original_app_user_id"), strOptNullableString != null ? Uri.parse(strOptNullableString) : null, date);
    }

    public static final Offering createOffering(JSONObject jSONObject, Map<String, StoreProduct> map) throws JSONException {
        String string = jSONObject.getString("identifier");
        JSONArray jSONArray = jSONObject.getJSONArray("packages");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Package packageCreatePackage = createPackage(jSONArray.getJSONObject(i), map, string);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        if (!arrayList.isEmpty()) {
            return new Offering(string, jSONObject.getString("description"), arrayList);
        }
        return null;
    }

    public static final Offerings createOfferings(JSONObject jSONObject, Map<String, StoreProduct> map) {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        String string = jSONObject.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Offering offeringCreateOffering = createOffering(jSONArray.getJSONObject(i), map);
            if (offeringCreateOffering != null) {
                linkedHashMap.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    LogUtilsKt.warnLog(String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{offeringCreateOffering.getIdentifier()}, 1)));
                }
            }
        }
        return new Offerings((Offering) linkedHashMap.get(string), linkedHashMap);
    }

    public static final Package createPackage(JSONObject jSONObject, Map<String, StoreProduct> map, String str) throws JSONException {
        StoreProduct storeProduct = map.get(jSONObject.getString("platform_product_identifier"));
        if (storeProduct == null) {
            return null;
        }
        String string = jSONObject.getString("identifier");
        return new Package(string, toPackageType(string), storeProduct, str);
    }

    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i];
            if (ur1.a(packageType.getIdentifier(), str)) {
                break;
            }
            i++;
        }
        if (packageType == null) {
            return iv4.x(str, "$rc_", false) ? PackageType.UNKNOWN : PackageType.CUSTOM;
        }
        return packageType;
    }
}
