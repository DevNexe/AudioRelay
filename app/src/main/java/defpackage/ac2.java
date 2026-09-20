package defpackage;

import android.annotation.TargetApi;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration$Builder;
import android.media.AudioRecord;
import android.media.AudioRecord$Builder;
import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(29)
public final class ac2 implements s0 {
    public final MediaProjection a;

    public ac2(MediaProjection mediaProjection) {
        this.a = mediaProjection;
    }

    @Override // defpackage.s0
    public final AudioRecord a(di diVar) {
        return new AudioRecord$Builder().setAudioFormat(new AudioFormat.Builder().setSampleRate(diVar.b).setEncoding(diVar.d).setChannelMask(diVar.c).build()).setBufferSizeInBytes(diVar.e).setAudioPlaybackCaptureConfig(new AudioPlaybackCaptureConfiguration$Builder(this.a).addMatchingUsage(1).addMatchingUsage(0).addMatchingUsage(14).build()).build();
    }
}
