package defpackage;

import android.content.Context;
import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class tk5 {
    public final Context a;

    public static final class QnHx extends ContentObserver {
        public final rg3<sd5> a;
        public final rg3 b;

        public QnHx() {
            super(null);
            rg3<sd5> rg3Var = new rg3<>();
            this.a = rg3Var;
            this.b = rg3Var;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            super.onChange(z);
            this.a.g(sd5.a);
        }
    }

    public tk5(Context context) {
        this.a = context;
    }
}
