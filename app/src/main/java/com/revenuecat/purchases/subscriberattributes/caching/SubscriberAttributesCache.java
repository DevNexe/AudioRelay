package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import defpackage.C0239D;
import defpackage.ds0;
import defpackage.oz1;
import defpackage.ry4;
import defpackage.t92;
import defpackage.ur1;
import defpackage.uy2;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final oz1 subscriberAttributesCacheKey$delegate = new ry4(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        this.deviceCache = deviceCache;
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str) {
        uy2 uy2Var;
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1)));
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
        for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            if (ur1.a(str, key)) {
                uy2Var = new uy2(key, value);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                    if (!entry2.getValue().isSynced()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                uy2Var = new uy2(key, linkedHashMap);
            }
            arrayList.add(uy2Var);
        }
        Map mapV = t92.V(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : mapV.entrySet()) {
            if (!((Map) entry3.getValue()).isEmpty()) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        putAttributes$subscriber_attributes_latestDependenciesRelease(this.deviceCache, linkedHashMap2);
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (true ^ entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2)));
        sb.append(linkedHashMap.isEmpty() ^ true ? wu.M0(linkedHashMap.values(), "\n", null, null, null, 62) : "");
        LogWrapperKt.log(logIntent, sb.toString());
        return linkedHashMap;
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str) {
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this);
        deleteSyncedSubscriberAttributesForOtherUsers(str);
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String str) {
        if (!getUnsyncedSubscriberAttributes(str).isEmpty()) {
            return;
        }
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{str}, 1)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(getAllStoredSubscriberAttributes());
        linkedHashMap.remove(str);
        putAttributes$subscriber_attributes_latestDependenciesRelease(this.deviceCache, t92.W(linkedHashMap));
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapBuildSubscriberAttributesMapPerUser;
        JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$subscriber_attributes_latestDependenciesRelease());
        if (jSONObjectOrNull == null || (mapBuildSubscriberAttributesMapPerUser = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
            mapBuildSubscriberAttributesMapPerUser = ds0.w;
        }
        return mapBuildSubscriberAttributesMapPerUser;
    }

    public final DeviceCache getDeviceCache$subscriber_attributes_latestDependenciesRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$subscriber_attributes_latestDependenciesRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C0239D.A(allStoredSubscriberAttributes.size()));
        for (Object obj : allStoredSubscriberAttributes.entrySet()) {
            Object key = ((Map.Entry) obj).getKey();
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
        }
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((Map) entry2.getValue()).isEmpty()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void putAttributes$subscriber_attributes_latestDependenciesRelease(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        this.deviceCache.putString(getSubscriberAttributesCacheKey$subscriber_attributes_latestDependenciesRelease(), CachingHelpersKt.toJSONObject(map).toString());
    }

    public final synchronized void setAttributes(String str, Map<String, SubscriberAttribute> map) {
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> map2 = allStoredSubscriberAttributes.get(str);
        if (map2 == null) {
            map2 = ds0.w;
        }
        putAttributes$subscriber_attributes_latestDependenciesRelease(this.deviceCache, t92.S(allStoredSubscriberAttributes, Collections.singletonMap(str, t92.S(map2, map))));
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String str) {
        Map<String, SubscriberAttribute> map;
        map = getAllStoredSubscriberAttributes().get(str);
        if (map == null) {
            map = ds0.w;
        }
        return map;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String str) {
        return filterUnsynced(getAllStoredSubscriberAttributes(str), str);
    }
}
