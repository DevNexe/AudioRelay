package com.revenuecat.purchases.utils;

import defpackage.ba4;
import defpackage.cx1;
import defpackage.j81;
import defpackage.t92;
import defpackage.uy2;
import defpackage.x94;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class JSONObjectExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends cx1 implements j81<String, uy2<? extends String, ? extends T>> {
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_toMap = jSONObject;
        }

        @Override // defpackage.j81
        public final uy2<String, T> invoke(String str) {
            return new uy2<>(str, this.$this_toMap.get(str));
        }
    }

    public static final Date getDate(JSONObject jSONObject, String str) {
        return Iso8601Utils.parse(jSONObject.getString(str));
    }

    public static final String getNullableString(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, str);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, str);
        }
        return null;
    }

    public static final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) {
        HashMap<String, Date> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, optDate(jSONObject.getJSONObject(next), str));
        }
        return map;
    }

    public static final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    public static final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null) {
            return null;
        }
        x94 x94VarF0 = ba4.F0(itKeys);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = x94VarF0.iterator();
        while (it.hasNext()) {
            uy2<? extends String, ? extends T> uy2VarInvoke = anonymousClass1.invoke(it.next());
            linkedHashMap.put(uy2VarInvoke.w, uy2VarInvoke.x);
        }
        return t92.R(linkedHashMap);
    }
}
