package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final rg5 f;
    public final long g;
    public final int h;
    public final boolean i;

    public ej1(String str, float f, float f2, float f3, float f4, rg5 rg5Var, long j, int i, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = rg5Var;
        this.g = j;
        this.h = i;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej1)) {
            return false;
        }
        ej1 ej1Var = (ej1) obj;
        if (!ur1.a(this.a, ej1Var.a) || !wm0.a(this.b, ej1Var.b) || !wm0.a(this.c, ej1Var.c)) {
            return false;
        }
        if (!(this.d == ej1Var.d)) {
            return false;
        }
        if ((this.e == ej1Var.e) && ur1.a(this.f, ej1Var.f) && yu.c(this.g, ej1Var.g)) {
            return (this.h == ej1Var.h) && this.i == ej1Var.i;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ry0.b(this.e, ry0.b(this.d, ry0.b(this.c, ry0.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = yu.i;
        return ((F65.a(this.g, iHashCode, 31) + this.h) * 31) + (this.i ? 1231 : 1237);
    }

    public static final class QnHx {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C0122QnHx> i;
        public final C0122QnHx j;
        public boolean k;

        /* JADX INFO: renamed from: ej1$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0122QnHx {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends uz2> i;
            public final List<tg5> j;

            public C0122QnHx() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            public C0122QnHx(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = sg5.a;
                    list = cs0.w;
                }
                ArrayList arrayList = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new ArrayList() : null;
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }
        }

        public QnHx(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
            this.g = i;
            this.h = z;
            ArrayList<C0122QnHx> arrayList = new ArrayList<>();
            this.i = arrayList;
            C0122QnHx c0122QnHx = new C0122QnHx(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c0122QnHx;
            arrayList.add(c0122QnHx);
        }

        public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            f();
            this.i.add(new C0122QnHx(str, f, f2, f3, f4, f5, f6, f7, list, AdRequest.MAX_CONTENT_URL_LENGTH));
        }

        public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, cg cgVar, cg cgVar2, String str, List list) {
            f();
            ArrayList<C0122QnHx> arrayList = this.i;
            arrayList.get(arrayList.size() - 1).j.add(new zg5(str, list, i, cgVar, f, cgVar2, f2, f3, i2, i3, f4, f5, f6, f7));
        }

        public final ej1 d() {
            f();
            while (this.i.size() > 1) {
                e();
            }
            String str = this.a;
            float f = this.b;
            float f2 = this.c;
            float f3 = this.d;
            float f4 = this.e;
            C0122QnHx c0122QnHx = this.j;
            ej1 ej1Var = new ej1(str, f, f2, f3, f4, new rg5(c0122QnHx.a, c0122QnHx.b, c0122QnHx.c, c0122QnHx.d, c0122QnHx.e, c0122QnHx.f, c0122QnHx.g, c0122QnHx.h, c0122QnHx.i, c0122QnHx.j), this.f, this.g, this.h);
            this.k = true;
            return ej1Var;
        }

        public final void e() {
            f();
            ArrayList<C0122QnHx> arrayList = this.i;
            C0122QnHx c0122QnHxRemove = arrayList.remove(arrayList.size() - 1);
            arrayList.get(arrayList.size() - 1).j.add(new rg5(c0122QnHxRemove.a, c0122QnHxRemove.b, c0122QnHxRemove.c, c0122QnHxRemove.d, c0122QnHxRemove.e, c0122QnHxRemove.f, c0122QnHxRemove.g, c0122QnHxRemove.h, c0122QnHxRemove.i, c0122QnHxRemove.j));
        }

        public final void f() {
            if (!(!this.k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        public QnHx(String str) {
            this(str, 24.0f, 24.0f, 24.0f, 24.0f, yu.h, 5, false);
        }
    }
}
