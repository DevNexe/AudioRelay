package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
public final class ia7 implements z97 {
    @Override // defpackage.z97
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.z97
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.z97
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.z97
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.z97
    public final boolean zze() {
        return false;
    }
}
