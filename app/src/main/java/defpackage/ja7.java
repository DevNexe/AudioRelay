package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
public final class ja7 implements z97 {
    public final int a;
    public MediaCodecInfo[] b;

    public ja7(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    @Override // defpackage.z97
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.z97
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.z97
    public final int zza() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // defpackage.z97
    public final MediaCodecInfo zzb(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }

    @Override // defpackage.z97
    public final boolean zze() {
        return true;
    }
}
