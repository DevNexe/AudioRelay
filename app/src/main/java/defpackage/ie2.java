package defpackage;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ie2 {
    public final lKy3 a;

    public static final class CQf extends cx1 implements j81<Integer, AudioEffect> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final AudioEffect invoke(Integer num) {
            return NoiseSuppressor.create(num.intValue());
        }
    }

    public static final class F1 extends cx1 implements j81<Integer, AudioEffect> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final AudioEffect invoke(Integer num) {
            return AcousticEchoCanceler.create(num.intValue());
        }
    }

    public static final class QnHx extends cx1 implements j81<Integer, AudioEffect> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final AudioEffect invoke(Integer num) {
            return AutomaticGainControl.create(num.intValue());
        }
    }

    public ie2(lKy3 lky3) {
        this.a = lky3;
    }

    public final List<me2> a() {
        boolean zIsAvailable = AutomaticGainControl.isAvailable();
        lKy3 lky3 = this.a;
        return ps0.M(new me2(1, QnHx.w, zIsAvailable, lky3.q), new me2(3, CQf.w, NoiseSuppressor.isAvailable(), lky3.o), new me2(2, F1.w, AcousticEchoCanceler.isAvailable(), lky3.p));
    }
}
