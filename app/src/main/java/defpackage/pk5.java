package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class pk5 {
    public final Context a;
    public final ry4 b = new ry4(new QnHx());

    public static final class QnHx extends cx1 implements h81<AudioManager> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final AudioManager invoke() {
            return (AudioManager) r80.c(pk5.this.a, AudioManager.class);
        }
    }

    public pk5(Context context) {
        this.a = context;
    }
}
