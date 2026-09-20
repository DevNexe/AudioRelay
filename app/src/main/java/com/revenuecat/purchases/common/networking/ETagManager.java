package com.revenuecat.purchases.common.networking;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.NetworkStrings;
import defpackage.Md5A;
import defpackage.kg0;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ETagManager {
    public static final Companion Companion = new Companion(null);
    private final SharedPreferences prefs;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kg0 kg0Var) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
        }
    }

    public ETagManager(SharedPreferences sharedPreferences) {
        this.prefs = sharedPreferences;
    }

    private final String getETag(String str) {
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        String eTag = storedResultSavedInSharedPreferences != null ? storedResultSavedInSharedPreferences.getETag() : null;
        return eTag == null ? "" : eTag;
    }

    public static /* synthetic */ Map getETagHeader$common_latestDependenciesRelease$default(ETagManager eTagManager, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return eTagManager.getETagHeader$common_latestDependenciesRelease(str, z);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = this.prefs.getString(str, null);
        if (string != null) {
            return HTTPResultWithETag.Companion.deserialize(string);
        }
        return null;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        this.prefs.edit().putString(str, new HTTPResultWithETag(str2, hTTPResult).serialize()).apply();
    }

    public final synchronized void clearCaches$common_latestDependenciesRelease() {
        this.prefs.edit().clear().apply();
    }

    public final Map<String, String> getETagHeader$common_latestDependenciesRelease(String str, boolean z) {
        return Collections.singletonMap(ETagManagerKt.ETAG_HEADER_NAME, z ? "" : getETag(str));
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$common_latestDependenciesRelease(int i, String str, HttpURLConnection httpURLConnection, String str2, boolean z) {
        HTTPResult hTTPResult = new HTTPResult(i, str);
        String eTagHeader = ETagManagerKt.getETagHeader(httpURLConnection);
        if (eTagHeader != null) {
            if (shouldUseCachedVersion$common_latestDependenciesRelease(i)) {
                HTTPResult storedResult$common_latestDependenciesRelease = getStoredResult$common_latestDependenciesRelease(str2);
                if (storedResult$common_latestDependenciesRelease != null) {
                    return storedResult$common_latestDependenciesRelease;
                }
                if (!z) {
                    return null;
                }
                Md5A.h(new Object[]{hTTPResult}, 1, NetworkStrings.ETAG_CALL_ALREADY_RETRIED, LogIntent.WARNING);
                return hTTPResult;
            }
            storeBackendResultIfNoError$common_latestDependenciesRelease(str2, hTTPResult, eTagHeader);
        }
        return hTTPResult;
    }

    public final HTTPResult getStoredResult$common_latestDependenciesRelease(String str) {
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$common_latestDependenciesRelease(int i) {
        return i == 304;
    }

    public final void storeBackendResultIfNoError$common_latestDependenciesRelease(String str, HTTPResult hTTPResult, String str2) {
        int responseCode = hTTPResult.getResponseCode();
        if (responseCode == 304 || responseCode >= 500) {
            return;
        }
        storeResult(str, hTTPResult, str2);
    }
}
