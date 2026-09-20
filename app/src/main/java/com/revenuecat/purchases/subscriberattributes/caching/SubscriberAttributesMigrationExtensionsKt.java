package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import defpackage.ds0;
import defpackage.mu;
import defpackage.mv4;
import defpackage.t92;
import defpackage.uy2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        ArrayList arrayList;
        Object objBuildLegacySubscriberAttributes;
        String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
        Set<String> setFindKeysThatStartWith = subscriberAttributesCache.getDeviceCache$subscriber_attributes_latestDependenciesRelease().findKeysThatStartWith(strLegacySubscriberAttributesCacheKey);
        arrayList = new ArrayList(mu.w0(setFindKeysThatStartWith, 10));
        for (String str : setFindKeysThatStartWith) {
            String str2 = (String) mv4.Q(str, new String[]{strLegacySubscriberAttributesCacheKey}).get(1);
            JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$subscriber_attributes_latestDependenciesRelease().getJSONObjectOrNull(str);
            if (jSONObjectOrNull == null || (objBuildLegacySubscriberAttributes = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                objBuildLegacySubscriberAttributes = ds0.w;
            }
            arrayList.add(new uy2(str2, objBuildLegacySubscriberAttributes));
        }
        return t92.V(arrayList);
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String str) {
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$subscriber_attributes_latestDependenciesRelease() + '.' + str;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap(allStoredSubscriberAttributes);
        for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : map.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            Map<String, SubscriberAttribute> map2 = allStoredSubscriberAttributes.get(key);
            if (map2 == null) {
                map2 = ds0.w;
            }
            linkedHashMap.put(key, t92.S(value, map2));
            subscriberAttributesCache.getDeviceCache$subscriber_attributes_latestDependenciesRelease().remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
        }
        subscriberAttributesCache.putAttributes$subscriber_attributes_latestDependenciesRelease(subscriberAttributesCache.getDeviceCache$subscriber_attributes_latestDependenciesRelease(), linkedHashMap);
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache) {
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (!(!allLegacyStoredSubscriberAttributes.isEmpty())) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes);
        }
    }
}
