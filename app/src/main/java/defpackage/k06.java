package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class k06 {
    public AudioTrack a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public final long a() {
        if (this.g != -9223372036854775807L) {
            return Math.min(this.i, ((((SystemClock.elapsedRealtime() * 1000) - this.g) * ((long) this.c)) / 1000000) + this.h);
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f = this.d;
            }
            playbackHeadPosition += this.f;
        }
        if (this.d > playbackHeadPosition) {
            this.e++;
        }
        this.d = playbackHeadPosition;
        return playbackHeadPosition + (this.e << 32);
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public void d(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.b = z;
        this.g = -9223372036854775807L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        if (audioTrack != null) {
            this.c = audioTrack.getSampleRate();
        }
    }

    public boolean e() {
        return false;
    }
}
