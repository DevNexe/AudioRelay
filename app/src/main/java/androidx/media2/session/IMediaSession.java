package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    public static abstract class Stub extends Binder implements IMediaSession {
        public static final /* synthetic */ int w = 0;

        public static class Proxy implements IMediaSession {
            public final IBinder w;

            public Proxy(IBinder iBinder) {
                this.w = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.w;
            }
        }
    }
}
