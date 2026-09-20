package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfus;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zznb;

/* JADX INFO: loaded from: classes3.dex */
public final class q57 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzel.zzj(i3)).build(), a)) {
                return i3;
            }
        }
        return 0;
    }

    public static int[] b() {
        zzfus zzfusVarZzi = zzfuv.zzi();
        zzfwu it = zznb.b.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), a)) {
                zzfusVarZzi.zze(Integer.valueOf(iIntValue));
            }
        }
        zzfusVarZzi.zze(2);
        Object[] array = zzfusVarZzi.zzg().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
