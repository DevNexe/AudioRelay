package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class bd7 implements Choreographer.FrameCallback, Handler.Callback {
    public static final bd7 A = new bd7();
    public volatile long w = -9223372036854775807L;
    public final Handler x;
    public Choreographer y;
    public int z;

    public bd7() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerZzC = zzel.zzC(handlerThread.getLooper(), this);
        this.x = handlerZzC;
        handlerZzC.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.w = j;
        Choreographer choreographer = this.y;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.y = Choreographer.getInstance();
            } catch (RuntimeException e) {
                zzdu.zzb("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 1) {
            Choreographer choreographer = this.y;
            if (choreographer != null) {
                int i2 = this.z + 1;
                this.z = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        Choreographer choreographer2 = this.y;
        if (choreographer2 != null) {
            int i3 = this.z - 1;
            this.z = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.w = -9223372036854775807L;
            }
        }
        return true;
    }
}
