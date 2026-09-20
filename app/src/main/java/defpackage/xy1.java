package defpackage;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy1 implements Comparator {
    public final /* synthetic */ int w;

    public /* synthetic */ xy1(int i) {
        this.w = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.w) {
            case 0:
                yy1 yy1Var = (yy1) obj;
                yy1 yy1Var2 = (yy1) obj2;
                float f = yy1Var.a0;
                float f2 = yy1Var2.a0;
                return (f > f2 ? 1 : (f == f2 ? 0 : -1)) == 0 ? ur1.b(yy1Var.R, yy1Var2.R) : Float.compare(f, f2);
            default:
                Charset charset = fc0.d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
