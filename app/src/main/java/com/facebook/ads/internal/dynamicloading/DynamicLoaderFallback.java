package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Keep
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    public class CQf implements Runnable {
        public final /* synthetic */ AdListener w;
        public final /* synthetic */ Ad x;

        public CQf(AdListener adListener, Ad ad) {
            this.w = adListener;
            this.x = ad;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.onError(this.x, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    public static class F1 {
        public Method a;
        public final QnHx b = new QnHx();

        public class QnHx implements InvocationHandler {
            public QnHx() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                F1.this.a = method;
                return null;
            }
        }

        public final <T> T a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
        }
    }

    public class QnHx implements InvocationHandler {
        public final /* synthetic */ List a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ List c;
        public final /* synthetic */ List d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ List f;
        public final /* synthetic */ List g;
        public final /* synthetic */ Method h;
        public final /* synthetic */ Method i;

        public QnHx(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.a = arrayList;
            this.b = map;
            this.c = arrayList2;
            this.d = arrayList3;
            this.e = map2;
            this.f = arrayList4;
            this.g = arrayList5;
            this.h = method;
            this.i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Map map;
            boolean zIsPrimitive = method.getReturnType().isPrimitive();
            Map map2 = this.b;
            if (zIsPrimitive) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
                }
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, map2)) {
                        return null;
                    }
                }
                return null;
            }
            if (method.getReturnType().equals(String.class)) {
                return "";
            }
            Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            Iterator it3 = this.d.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                map = this.e;
                if (!zHasNext) {
                    break;
                }
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it4 = this.f.iterator();
            while (it4.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    map.put(objNewProxyInstance, obj);
                }
            }
            Iterator it5 = this.g.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            map2.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.h)) {
                map2.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.i)) {
                map2.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        F1 f1 = new F1();
        DynamicLoader dynamicLoader = (DynamicLoader) f1.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(f1.a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(f1.a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(f1.a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(f1.a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = f1.a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = f1.a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) f1.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(f1.a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(f1.a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(f1.a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) f1.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(f1.a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(f1.a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(f1.a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) f1.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(f1.a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(f1.a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(f1.a);
        AdViewApi adViewApi = (AdViewApi) f1.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(f1.a);
        adViewApi.loadAd(null);
        arrayList2.add(f1.a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(f1.a);
        ((AdView.AdViewLoadConfigBuilder) f1.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(f1.a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) f1.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(f1.a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) f1.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(f1.a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) f1.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(f1.a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new QnHx(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new CQf(adListener, ad), 500L);
        return true;
    }
}
