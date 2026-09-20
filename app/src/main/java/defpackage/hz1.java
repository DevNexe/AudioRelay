package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends yy1.YKK {
    public final /* synthetic */ gz1 b;
    public final /* synthetic */ x81<bw4, g70, sb2> c;

    public static final class QnHx implements sb2 {
        public final /* synthetic */ sb2 a;
        public final /* synthetic */ gz1 b;
        public final /* synthetic */ int c;

        public QnHx(sb2 sb2Var, gz1 gz1Var, int i) {
            this.a = sb2Var;
            this.b = gz1Var;
            this.c = i;
        }

        @Override // defpackage.sb2
        public final void a() {
            gz1 gz1Var = this.b;
            gz1Var.d = this.c;
            this.a.a();
            gz1Var.a(gz1Var.d);
        }

        @Override // defpackage.sb2
        public final Map<IlK, Integer> c() {
            return this.a.c();
        }

        @Override // defpackage.sb2
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // defpackage.sb2
        public final int getWidth() {
            return this.a.getWidth();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hz1(gz1 gz1Var, x81<? super bw4, ? super g70, ? extends sb2> x81Var, String str) {
        super(str);
        this.b = gz1Var;
        this.c = x81Var;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        gz1 gz1Var = this.b;
        gz1Var.g.w = vb2Var.getLayoutDirection();
        float density = vb2Var.getDensity();
        gz1.CQf cQf = gz1Var.g;
        cQf.x = density;
        cQf.y = vb2Var.U();
        gz1Var.d = 0;
        return new QnHx(this.c.invoke(cQf, new g70(j)), gz1Var, gz1Var.d);
    }
}
