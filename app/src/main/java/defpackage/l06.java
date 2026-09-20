package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public final class l06 extends k06 {
    public final AudioTimestamp j = new AudioTimestamp();
    public long k;
    public long l;
    public long m;

    @Override // defpackage.k06
    public final long b() {
        return this.m;
    }

    @Override // defpackage.k06
    public final long c() {
        return this.j.nanoTime;
    }

    @Override // defpackage.k06
    public final void d(AudioTrack audioTrack, boolean z) {
        super.d(audioTrack, z);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // defpackage.k06
    public final boolean e() {
        AudioTrack audioTrack = this.a;
        AudioTimestamp audioTimestamp = this.j;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j = audioTimestamp.framePosition;
            if (this.l > j) {
                this.k++;
            }
            this.l = j;
            this.m = j + (this.k << 32);
        }
        return timestamp;
    }
}
