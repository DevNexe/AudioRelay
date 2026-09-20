package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class ua5 {

    @AutoValue.Builder
    public static abstract class QnHx {
    }

    public static j4.QnHx a() {
        j4.QnHx qnHx = new j4.QnHx();
        qnHx.c(ie3.DEFAULT);
        return qnHx;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract ie3 d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
