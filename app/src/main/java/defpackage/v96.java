package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzckz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v96 implements Runnable {
    public final /* synthetic */ zzckz A;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public v96(zzckz zzckzVar, String str, String str2, String str3, String str4) {
        this.A = zzckzVar;
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.w);
        String str2 = this.x;
        if (!TextUtils.isEmpty(str2)) {
            map.put("cachedSrc", str2);
        }
        String str3 = this.y;
        switch (str3) {
            case "expireFailed":
            case "noCacheDir":
                str = "io";
                break;
            case "badUrl":
            case "downloadTimeout":
                str = "network";
                break;
            case "externalAbort":
            case "sizeExceeded":
                str = "policy";
                break;
            case "contentLengthMissing":
            case "error":
            case "inProgress":
            case "interrupted":
            case "noop":
            case "playerFailed":
            default:
                str = "internal";
                break;
        }
        map.put("type", str);
        map.put("reason", str3);
        String str4 = this.z;
        if (!TextUtils.isEmpty(str4)) {
            map.put("message", str4);
        }
        zzckz.a(this.A, map);
    }
}
