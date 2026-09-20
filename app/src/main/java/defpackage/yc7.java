package defpackage;

import android.view.Surface;
import com.google.android.gms.internal.ads.zzdu;

/* JADX INFO: loaded from: classes3.dex */
public final class yc7 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzdu.zza("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
