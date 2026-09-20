package defpackage;

import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class wk5 implements c73 {
    public final i60 a;
    public final tk5 b;
    public final pk5 c;
    public final sd2 d;
    public final pq2 e;

    public static final class QnHx extends cx1 implements h81<qw> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final qw invoke() {
            c54 c54Var = j54.b;
            wk5 wk5Var = wk5.this;
            vq2<R> vq2VarB = wk5Var.a.b().u(c54Var).B(new j71(3, wk5Var, c54Var));
            Ot0r ot0r = new Ot0r(wk5Var, 9);
            vq2VarB.getClass();
            return new xs2(vq2VarB, ot0r);
        }
    }

    public wk5(i60 i60Var, tk5 tk5Var, pk5 pk5Var, sd2 sd2Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = tk5Var;
        this.c = pk5Var;
        this.d = sd2Var;
        this.e = pq2Var;
    }

    public final ok5 a() {
        pk5 pk5Var = this.c;
        int streamVolume = ((AudioManager) pk5Var.b.getValue()).getStreamVolume(3);
        ry4 ry4Var = pk5Var.b;
        return new ok5(streamVolume, Build.VERSION.SDK_INT >= 28 ? ((AudioManager) ry4Var.getValue()).getStreamMinVolume(3) : 0, ((AudioManager) ry4Var.getValue()).getStreamMaxVolume(3));
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        QnHx qnHx = new QnHx();
        this.e.getClass();
        return pq2.i("Player:VolumeObserver", qnHx);
    }
}
