package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class FLr<I, O> {

    public static final class QnHx<T> {
        public final T a;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Serializable serializable) {
            this.a = serializable;
        }
    }

    public abstract Intent a(Object obj);

    public QnHx b(ComponentActivity componentActivity, Object obj) {
        return null;
    }

    public abstract Object c(Intent intent, int i);
}
