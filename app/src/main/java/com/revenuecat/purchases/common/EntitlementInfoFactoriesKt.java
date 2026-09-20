package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import defpackage.ur1;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class EntitlementInfoFactoriesKt {
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date) throws JSONException {
        boolean z;
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(jSONObject2, "unsubscribe_detected_at");
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(jSONObject2, "billing_issues_detected_at");
        Store store = getStore(jSONObject2, "store");
        if (dateOptDate == null) {
            z = true;
        } else {
            if (dateOptDate.after(date == null ? new Date() : date)) {
                z = true;
            } else {
                z = false;
            }
        }
        return new EntitlementInfo(str, z, getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3), optPeriodType(jSONObject2, "period_type"), JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date"), JSONObjectExtensionsKt.getDate(jSONObject2, "original_purchase_date"), dateOptDate, store, jSONObject.getString("product_identifier"), jSONObject2.getBoolean("is_sandbox"), dateOptDate2, dateOptDate3, optOwnershipType(jSONObject2, "ownership_type"), jSONObject);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
            String strOptString = jSONObject4.optString("product_identifier");
            if (!(strOptString.length() > 0)) {
                strOptString = null;
            }
            if (strOptString != null) {
                if (jSONObject2.has(strOptString)) {
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject2.getJSONObject(strOptString), date));
                } else if (jSONObject3.has(strOptString)) {
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject3.getJSONObject(strOptString), date));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Store getStore(JSONObject jSONObject, String str) throws JSONException {
        String string = jSONObject.getString(str);
        if (string != null) {
            switch (string.hashCode()) {
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        return ((store == Store.PROMOTIONAL) || (date == null) || (date2 != null) || (date3 != null)) ? false : true;
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (ur1.a(strOptString, "PURCHASED")) {
            return OwnershipType.PURCHASED;
        }
        return ur1.a(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1039745817) {
                if (iHashCode != 100361836) {
                    if (iHashCode == 110628630 && strOptString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                } else if (strOptString.equals("intro")) {
                    return PeriodType.INTRO;
                }
            } else if (strOptString.equals("normal")) {
                return PeriodType.NORMAL;
            }
        }
        return PeriodType.NORMAL;
    }
}
