package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public final class h36 implements Choreographer.FrameCallback, Handler.Callback {
    public static final h36 A = new h36();
    public volatile long w;
    public final Handler x;
    public Choreographer y;
    public int z;

    public h36() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.x = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.w = j;
        this.y.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.y = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.z + 1;
            this.z = i2;
            if (i2 == 1) {
                this.y.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.z - 1;
        this.z = i3;
        if (i3 == 0) {
            this.y.removeFrameCallback(this);
            this.w = 0L;
        }
        return true;
    }
}
