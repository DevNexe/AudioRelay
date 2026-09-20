package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import defpackage.dj;
import defpackage.kg0;
import defpackage.t92;
import defpackage.ur1;
import defpackage.uy2;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttribute {
    private final DateProvider dateProvider;
    private final boolean isSynced;
    private final SubscriberAttributeKey key;
    private final Date setTime;
    private final String value;

    public SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z) {
        this.key = subscriberAttributeKey;
        this.value = str;
        this.dateProvider = dateProvider;
        this.setTime = date;
        this.isSynced = z;
    }

    public static /* synthetic */ SubscriberAttribute copy$default(SubscriberAttribute subscriberAttribute, SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriberAttributeKey = subscriberAttribute.key;
        }
        if ((i & 2) != 0) {
            str = subscriberAttribute.value;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            dateProvider = subscriberAttribute.dateProvider;
        }
        DateProvider dateProvider2 = dateProvider;
        if ((i & 8) != 0) {
            date = subscriberAttribute.setTime;
        }
        Date date2 = date;
        if ((i & 16) != 0) {
            z = subscriberAttribute.isSynced;
        }
        return subscriberAttribute.copy(subscriberAttributeKey, str2, dateProvider2, date2, z);
    }

    public final SubscriberAttributeKey component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.setTime;
    }

    public final boolean component5() {
        return this.isSynced;
    }

    public final SubscriberAttribute copy(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z) {
        return new SubscriberAttribute(subscriberAttributeKey, str, dateProvider, date, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(SubscriberAttribute.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttribute");
        }
        SubscriberAttribute subscriberAttribute = (SubscriberAttribute) obj;
        return ur1.a(this.key, subscriberAttribute.key) && ur1.a(this.value, subscriberAttribute.value) && ur1.a(this.setTime, subscriberAttribute.setTime) && this.isSynced == subscriberAttribute.isSynced;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final SubscriberAttributeKey getKey() {
        return this.key;
    }

    public final Date getSetTime() {
        return this.setTime;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        return ((this.setTime.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31) + (this.isSynced ? 1231 : 1237);
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final Map<String, Object> toBackendMap() {
        return t92.Q(new uy2("value", this.value), new uy2(SubscriberAttributeKt.BACKEND_NAME_TIMESTAMP, Long.valueOf(this.setTime.getTime())));
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_KEY, this.key.getBackendKey());
        String str = this.value;
        if (str == null || jSONObject.put("value", str) == null) {
            jSONObject.put("value", JSONObject.NULL);
        }
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_SET_TIME, this.setTime.getTime());
        jSONObject.put(SubscriberAttributeKt.JSON_NAME_IS_SYNCED, this.isSynced);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriberAttribute(key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", setTime=");
        sb.append(this.setTime);
        sb.append(", isSynced=");
        return dj.c(sb, this.isSynced, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z, int i, kg0 kg0Var) {
        DateProvider defaultDateProvider = (i & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(subscriberAttributeKey, str, defaultDateProvider, (i & 8) != 0 ? defaultDateProvider.getNow() : date, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z, int i, kg0 kg0Var) {
        DateProvider defaultDateProvider = (i & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(str, str2, defaultDateProvider, (i & 8) != 0 ? defaultDateProvider.getNow() : date, (i & 16) != 0 ? false : z);
    }

    public SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(str), str2, (DateProvider) null, date, z, 4, (kg0) null);
    }

    public SubscriberAttribute(JSONObject jSONObject) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY)), JSONObjectExtensionsKt.getNullableString(jSONObject, "value"), (DateProvider) null, new Date(jSONObject.getLong(SubscriberAttributeKt.JSON_NAME_SET_TIME)), jSONObject.getBoolean(SubscriberAttributeKt.JSON_NAME_IS_SYNCED), 4, (kg0) null);
    }
}
