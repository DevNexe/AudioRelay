package com.revenuecat.purchases.common.caching;

import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.common.CustomerInfoFactoriesKt;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.ReceiptStrings;
import defpackage.Md5A;
import defpackage.ddf;
import defpackage.hs0;
import defpackage.iv4;
import defpackage.kg0;
import defpackage.oz1;
import defpackage.ry4;
import defpackage.sb5;
import defpackage.t92;
import defpackage.wu;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceCache {
    private final String apiKey;
    private final oz1 appUserIDCacheKey$delegate;
    private final String attributionCacheKey;
    private final oz1 customerInfoCachesLastUpdatedCacheBaseKey$delegate;
    private final DateProvider dateProvider;
    private final oz1 legacyAppUserIDCacheKey$delegate;
    private final InMemoryCachedObject<Offerings> offeringsCachedObject;
    private final SharedPreferences preferences;
    private final oz1 tokensCacheKey$delegate;

    public DeviceCache(SharedPreferences sharedPreferences, String str, InMemoryCachedObject<Offerings> inMemoryCachedObject, DateProvider dateProvider) {
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.offeringsCachedObject = inMemoryCachedObject;
        this.dateProvider = dateProvider;
        this.legacyAppUserIDCacheKey$delegate = new ry4(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey$delegate = new ry4(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey$delegate = new ry4(new DeviceCache$tokensCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey$delegate = new ry4(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    private final void clearOfferingsCache() {
        this.offeringsCachedObject.clearCache();
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    private final boolean isStale(Date date, boolean z) {
        if (date == null) {
            return true;
        }
        Md5A.h(new Object[]{Boolean.valueOf(z)}, 1, ReceiptStrings.CHECKING_IF_CACHE_STALE, LogIntent.DEBUG);
        return this.dateProvider.getNow().getTime() - date.getTime() >= ((long) (z ? 90000000 : 300000));
    }

    private final synchronized void setSavedTokenHashes(Set<String> set) {
        LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{set}, 1)));
        this.preferences.edit().putStringSet(getTokensCacheKey(), set).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{str, UtilsKt.sha1(str)}, 2)));
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        LogWrapperKt.log(logIntent, String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1)));
        Set<String> setG1 = wu.g1(previouslySentHashedTokens);
        setG1.add(UtilsKt.sha1(str));
        setSavedTokenHashes(setG1);
    }

    public final synchronized void cacheAppUserID(String str) {
        this.preferences.edit().putString(getAppUserIDCacheKey(), str).apply();
    }

    public final synchronized void cacheCustomerInfo(String str, CustomerInfo customerInfo) {
        JSONObject jsonObject = customerInfo.getJsonObject();
        jsonObject.put("schema_version", 3);
        this.preferences.edit().putString(customerInfoCacheKey(str), jsonObject.toString()).apply();
        setCustomerInfoCacheTimestampToNow(str);
    }

    public final synchronized void cacheOfferings(Offerings offerings) {
        this.offeringsCachedObject.cacheInstance(offerings);
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> set) {
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        Set<String> setG1 = wu.g1(set);
        sb5.a(setG1).retainAll(ddf.g(previouslySentHashedTokens, setG1));
        setSavedTokenHashes(setG1);
    }

    public final synchronized void cleanupOldAttributionData() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        for (String str : this.preferences.getAll().keySet()) {
            if (iv4.x(str, this.attributionCacheKey, false)) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }

    public final synchronized void clearCachesForAppUserID(String str) {
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(this.preferences.edit())), str).apply();
        clearOfferingsCache();
    }

    public final synchronized void clearCustomerInfoCache(String str) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        clearCustomerInfoCacheTimestamp(editorEdit, str);
        editorEdit.remove(customerInfoCacheKey(str));
        editorEdit.apply();
    }

    public final synchronized void clearOfferingsCacheTimestamp() {
        this.offeringsCachedObject.clearCacheTimestamp();
    }

    public final String customerInfoCacheKey(String str) {
        return getLegacyAppUserIDCacheKey() + '.' + str;
    }

    public final String customerInfoLastUpdatedCacheKey(String str) {
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + str;
    }

    public final Set<String> findKeysThatStartWith(String str) {
        hs0 hs0Var = hs0.w;
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all == null) {
                return hs0Var;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (iv4.x(entry.getKey(), str, false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set<String> setKeySet = linkedHashMap.keySet();
            return setKeySet != null ? setKeySet : hs0Var;
        } catch (NullPointerException unused) {
            return hs0Var;
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> map) {
        LinkedHashMap linkedHashMap;
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        linkedHashMap = new LinkedHashMap(map);
        Set setKeySet = linkedHashMap.keySet();
        sb5.a(setKeySet).removeAll(ddf.g(previouslySentHashedTokens, setKeySet));
        return wu.e1(t92.R(linkedHashMap).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey$delegate.getValue();
    }

    public final String getAttributionCacheKey$common_latestDependenciesRelease() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final CustomerInfo getCachedCustomerInfo(String str) {
        String string = this.preferences.getString(customerInfoCacheKey(str), null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.optInt("schema_version") == 3) {
                return CustomerInfoFactoriesKt.buildCustomerInfo(jSONObject);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final Offerings getCachedOfferings() {
        return this.offeringsCachedObject.getCachedInstance();
    }

    public final synchronized Date getCustomerInfoCachesLastUpdated(String str) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(str), 0L));
    }

    public JSONObject getJSONObjectOrNull(String str) {
        String string = this.preferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey$delegate.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        Set<String> setH1;
        try {
            SharedPreferences sharedPreferences = this.preferences;
            String tokensCacheKey = getTokensCacheKey();
            setH1 = hs0.w;
            Set<String> stringSet = sharedPreferences.getStringSet(tokensCacheKey, setH1);
            if (stringSet != null) {
                setH1 = wu.h1(stringSet);
            }
            LogWrapperKt.log(LogIntent.DEBUG, String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{setH1}, 1)));
        } catch (ClassCastException unused) {
            setH1 = hs0.w;
        }
        return setH1;
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey$delegate.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String str, boolean z) {
        return isStale(getCustomerInfoCachesLastUpdated(str), z);
    }

    public final synchronized boolean isOfferingsCacheStale(boolean z) {
        return isStale(this.offeringsCachedObject.getLastUpdatedAt$common_latestDependenciesRelease(), z);
    }

    public final String newKey(String str) {
        return "com.revenuecat.purchases." + this.apiKey + '.' + str;
    }

    public void putString(String str, String str2) {
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void remove(String str) {
        this.preferences.edit().remove(str).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String str, Date date) {
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(str), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String str) {
        setCustomerInfoCacheTimestamp(str, new Date());
    }

    public final synchronized void setOfferingsCacheTimestampToNow() {
        this.offeringsCachedObject.updateCacheTimestamp(new Date());
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String str) {
        clearCustomerInfoCacheTimestamp(this.preferences.edit(), str).apply();
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, InMemoryCachedObject inMemoryCachedObject, DateProvider dateProvider, int i, kg0 kg0Var) {
        this(sharedPreferences, str, (i & 4) != 0 ? new InMemoryCachedObject(null, null, 3, null) : inMemoryCachedObject, (i & 8) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
