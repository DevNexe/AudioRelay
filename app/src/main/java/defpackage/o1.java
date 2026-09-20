package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack$Builder;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    public static AudioTrack a(t6r8 t6r8Var) {
        int i = t6r8Var.j.b;
        int i2 = Build.VERSION.SDK_INT;
        Sb1 sb1 = t6r8Var.f;
        q1 q1Var = t6r8Var.i;
        if (i2 < 23) {
            return new AudioTrack(b(q1Var), c(sb1), i, 1, 0);
        }
        AudioTrack$Builder bufferSizeInBytes = new AudioTrack$Builder().setAudioAttributes(b(q1Var)).setAudioFormat(c(sb1)).setBufferSizeInBytes(i);
        if (q1Var.a && i2 >= 26) {
            bufferSizeInBytes.setPerformanceMode(1);
        }
        return bufferSizeInBytes.build();
    }

    public static AudioAttributes b(q1 q1Var) {
        int i;
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(1).setContentType(2);
        if (q1Var.a && (i = Build.VERSION.SDK_INT) >= 24 && i < 26) {
            contentType.setFlags(256);
        }
        return contentType.build();
    }

    public static AudioFormat c(Sb1 sb1) throws Exception {
        int i = sb1.a;
        int iN = XTd3.n(sb1);
        XTd3.j(sb1);
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(iN).setEncoding(2).build();
    }
}
