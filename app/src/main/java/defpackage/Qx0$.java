package defpackage;

import android.media.projection.MediaProjection;

/* JADX INFO: loaded from: classes.dex */
public abstract class Qx0$ implements vb4 {

    public static final class CQf extends Qx0$ {
        public final MediaProjection a;

        public CQf(MediaProjection mediaProjection) {
            this.a = mediaProjection;
        }

        @Override // defpackage.Qx0$, defpackage.vb4
        public final void close() {
            this.a.stop();
        }
    }

    public static final class QnHx extends Qx0$ {
        public static final QnHx a = new QnHx();
    }

    @Override // defpackage.vb4
    public void close() {
    }
}
