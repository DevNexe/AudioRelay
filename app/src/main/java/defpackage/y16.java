package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
public final class y16 implements x16 {
    @Override // defpackage.x16
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // defpackage.x16
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.x16
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.x16
    public final boolean zzd() {
        return false;
    }
}
