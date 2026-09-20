package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx extends Thread {
    public final /* synthetic */ Map w;

    public QnHx(HashMap map) {
        this.w = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.w;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(builderBuildUpon.build().toString());
    }
}
