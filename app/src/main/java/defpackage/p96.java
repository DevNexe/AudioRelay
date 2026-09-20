package defpackage;

import com.google.android.gms.internal.ads.zzalj;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzalr;

/* JADX INFO: loaded from: classes3.dex */
public final class p96 extends zzalj {
    public static final p96 c = new p96();

    @Override // com.google.android.gms.internal.ads.zzalj
    public final zzaln zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzalp();
        }
        return "mvhd".equals(str) ? new zzalq() : new zzalr(str);
    }
}
