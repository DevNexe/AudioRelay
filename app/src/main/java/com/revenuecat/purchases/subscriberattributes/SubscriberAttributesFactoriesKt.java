package com.revenuecat.purchases.subscriberattributes;

import defpackage.ba4;
import defpackage.cx1;
import defpackage.j81;
import defpackage.t92;
import defpackage.uy2;
import defpackage.x94;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesFactoriesKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements j81<String, uy2<? extends String, ? extends SubscriberAttribute>> {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override // defpackage.j81
        public final uy2<String, SubscriberAttribute> invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            if (obj != null) {
                return new uy2<>(str, new SubscriberAttribute((JSONObject) obj));
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14381 extends cx1 implements j81<String, uy2<? extends String, ? extends Map<String, ? extends SubscriberAttribute>>> {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14381(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override // defpackage.j81
        public final uy2<String, Map<String, SubscriberAttribute>> invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            if (obj != null) {
                return new uy2<>(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) {
        return buildSubscriberAttributesMap(jSONObject.getJSONObject("attributes"));
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        x94 x94VarF0 = ba4.F0(jSONObject.keys());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = x94VarF0.iterator();
        while (it.hasNext()) {
            uy2<? extends String, ? extends SubscriberAttribute> uy2VarInvoke = anonymousClass1.invoke(it.next());
            linkedHashMap.put(uy2VarInvoke.w, uy2VarInvoke.x);
        }
        return t92.R(linkedHashMap);
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        x94 x94VarF0 = ba4.F0(jSONObject2.keys());
        C14381 c14381 = new C14381(jSONObject2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = x94VarF0.iterator();
        while (it.hasNext()) {
            uy2<? extends String, ? extends Map<String, ? extends SubscriberAttribute>> uy2VarInvoke = c14381.invoke(it.next());
            linkedHashMap.put(uy2VarInvoke.w, uy2VarInvoke.x);
        }
        return t92.R(linkedHashMap);
    }
}
