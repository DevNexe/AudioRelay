package com.revenuecat.purchases.subscriberattributes;

import android.app.Application;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import defpackage.cx1;
import defpackage.h81;
import defpackage.hl3;
import defpackage.j81;
import defpackage.kg0;
import defpackage.sd5;
import defpackage.t92;
import defpackage.ur1;
import defpackage.uy2;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();

    public static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<h81<sd5>> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.QnHx
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable.m31_init_$lambda2(this.a, observable, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
        public static final void m31_init_$lambda2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            if (observable == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            }
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    Iterator<T> it = obtainDeviceIdentifiersObservable.listeners.iterator();
                    while (it.hasNext()) {
                        ((h81) it.next()).invoke();
                    }
                    obtainDeviceIdentifiersObservable.listeners.clear();
                    sd5 sd5Var = sd5.a;
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i) {
            if (this.numberOfProcesses == i) {
                return;
            }
            this.numberOfProcesses = i;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(h81<sd5> h81Var) {
            if (this.numberOfProcesses == 0) {
                h81Var.invoke();
            }
            this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(h81Var));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1, reason: invalid class name */
    public static final class AnonymousClass1 extends cx1 implements j81<Map<String, ? extends String>, sd5> {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            SubscriberAttributesManager.this.setAttributes(map, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14391 extends cx1 implements j81<Map<String, ? extends String>, sd5> {
        final /* synthetic */ j81<Map<String, String>, sd5> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14391(j81<? super Map<String, String>, sd5> j81Var, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = j81Var;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            this.$completion.invoke(map);
            ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.this$0.obtainingDeviceIdentifiersObservable;
            obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14401 extends cx1 implements h81<sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ j81<Map<String, SubscriberAttribute>, sd5> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14401(j81<? super Map<String, SubscriberAttribute>, sd5> j81Var, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = j81Var;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14411 extends cx1 implements j81<Map<String, ? extends String>, sd5> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
        final /* synthetic */ String $value;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14411(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
            super(1);
            this.$attributionKey = attributionIds;
            this.$value = str;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str2;
        }

        @Override // defpackage.j81
        public /* bridge */ /* synthetic */ sd5 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> map) {
            this.this$0.setAttributes(t92.S(Collections.singletonMap(this.$attributionKey.getBackendKey(), this.$value), map), this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C14421 extends cx1 implements h81<sd5> {
        final /* synthetic */ h81<sd5> $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14421(h81<sd5> h81Var, String str) {
            super(0);
            this.$completion = h81Var;
            this.$currentAppUserID = str;
        }

        @Override // defpackage.h81
        public /* bridge */ /* synthetic */ sd5 invoke() {
            invoke2();
            return sd5.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            if (unsyncedSubscriberAttributes.isEmpty()) {
                LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
                h81<sd5> h81Var = this.$completion;
                if (h81Var != null) {
                    h81Var.invoke();
                    return;
                }
                return;
            }
            int size = unsyncedSubscriberAttributes.size();
            hl3 hl3Var = new hl3();
            SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
            String str = this.$currentAppUserID;
            h81<sd5> h81Var2 = this.$completion;
            Iterator<Map.Entry<String, Map<String, SubscriberAttribute>>> it = unsyncedSubscriberAttributes.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Map<String, SubscriberAttribute>> next = it.next();
                String key = next.getKey();
                Map<String, SubscriberAttribute> value = next.getValue();
                subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(value), key, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(subscriberAttributesManager, key, value, str, hl3Var, h81Var2, size), new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(subscriberAttributesManager, key, value, hl3Var, h81Var2, size));
                it = it;
                str = str;
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesPoster subscriberAttributesPoster, DeviceIdentifiersFetcher deviceIdentifiersFetcher) {
        this.deviceCache = subscriberAttributesCache;
        this.backend = subscriberAttributesPoster;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
    }

    private final void getDeviceIdentifiers(Application application, j81<? super Map<String, String>, sd5> j81Var) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new C14391(j81Var, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> map, String str) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, SubscriberAttribute>> it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, SubscriberAttribute> next = it.next();
            String key = next.getKey();
            SubscriberAttribute value = next.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (ur1.a(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                    z = false;
                }
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.deviceCache.setAttributes(str, linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, h81 h81Var, int i, Object obj) {
        if ((i & 2) != 0) {
            h81Var = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, h81Var);
    }

    public final void collectDeviceIdentifiers(String str, Application application) {
        getDeviceIdentifiers(application, new AnonymousClass1(str));
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String str, j81<? super Map<String, SubscriberAttribute>, sd5> j81Var) {
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C14401(j81Var, this, str));
    }

    public final synchronized void markAsSynced(String str, Map<String, SubscriberAttribute> map, List<SubscriberAttributeError> list) {
        if (!list.isEmpty()) {
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{list}, 1)));
        }
        if (map.isEmpty()) {
            return;
        }
        LogWrapperKt.log(LogIntent.INFO, String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{str}, 1)).concat(wu.M0(map.values(), "\n", null, null, null, 62)));
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(allStoredSubscriberAttributes);
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
            if (subscriberAttribute != null) {
                if (subscriberAttribute.isSynced()) {
                    subscriberAttribute = null;
                }
                if (subscriberAttribute != null) {
                    if ((ur1.a(subscriberAttribute.getValue(), value.getValue()) ? subscriberAttribute : null) != null) {
                        linkedHashMap.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                    }
                }
            }
        }
        this.deviceCache.setAttributes(str, linkedHashMap);
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, String str2) {
        setAttributes(Collections.singletonMap(subscriberAttributeKey.getBackendKey(), str), str2);
    }

    public final synchronized void setAttributes(Map<String, String> map, String str) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            arrayList.add(new uy2(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (kg0) null)));
        }
        storeAttributesIfNeeded(t92.V(arrayList), str);
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionIds, String str, String str2, Application application) {
        getDeviceIdentifiers(application, new C14411(attributionIds, str, this, str2));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String str, h81<sd5> h81Var) {
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C14421(h81Var, str));
    }
}
