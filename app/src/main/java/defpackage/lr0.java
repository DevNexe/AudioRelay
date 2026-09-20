package defpackage;

import androidx.emoji2.text.T23;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lr0 {
    public static final ThreadLocal<ce2> d = new ThreadLocal<>();
    public final int a;
    public final T23 b;
    public volatile int c = 0;

    public lr0(T23 t23, int i) {
        this.b = t23;
        this.a = i;
    }

    public final int a(int i) {
        ce2 ce2VarC = c();
        int iA = ce2VarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = ce2VarC.b;
        int i2 = iA + ce2VarC.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        ce2 ce2VarC = c();
        int iA = ce2VarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + ce2VarC.a;
        return ce2VarC.b.getInt(ce2VarC.b.getInt(i) + i);
    }

    public final ce2 c() {
        ThreadLocal<ce2> threadLocal = d;
        ce2 ce2Var = threadLocal.get();
        if (ce2Var == null) {
            ce2Var = new ce2();
            threadLocal.set(ce2Var);
        }
        de2 de2Var = this.b.a;
        int iA = de2Var.a(6);
        if (iA != 0) {
            int i = iA + de2Var.a;
            int i2 = (this.a * 4) + de2Var.b.getInt(i) + i + 4;
            ce2Var.b(de2Var.b, de2Var.b.getInt(i2) + i2);
        }
        return ce2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ce2 ce2VarC = c();
        int iA = ce2VarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ce2VarC.b.getInt(iA + ce2VarC.a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
