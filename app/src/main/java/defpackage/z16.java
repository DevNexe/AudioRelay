package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public final class z16 implements x16 {
    public final int a;
    public MediaCodecInfo[] b;

    public z16(boolean z) {
        this.a = z ? 1 : 0;
    }

    @Override // defpackage.x16
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // defpackage.x16
    public final int zza() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.x16
    public final MediaCodecInfo zzb(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.x16
    public final boolean zzd() {
        return true;
    }
}
