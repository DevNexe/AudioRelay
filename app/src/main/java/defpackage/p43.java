package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p43 {
    public final h22 a;
    public final int b;

    public static final class CQf extends p43 {
        public static final CQf c = new CQf();

        public CQf() {
            super(new rp3(R.string.premium_2_months_period), 3);
        }
    }

    public static final class F1 extends p43 {
        public static final F1 c = new F1();

        public F1() {
            super(new rp3(R.string.premium_lifetime_period), 7);
        }
    }

    public static final class LPt8Fixed extends p43 {
        public static final LPt8Fixed c = new LPt8Fixed();

        public LPt8Fixed() {
            super(new rp3(R.string.premium_monthly_period), 2);
        }
    }

    public static final class NUlFixed extends p43 {
        public static final NUlFixed c = new NUlFixed();

        public NUlFixed() {
            super(new rp3(R.string.premium_quarterly_period), 4);
        }
    }

    public static final class QnHx extends p43 {
        public static final QnHx c = new QnHx();

        public QnHx() {
            super(new rp3(R.string.premium_6_months_period), 5);
        }
    }

    public static final class YKK extends p43 {
        public static final YKK c = new YKK();

        public YKK() {
            super(new rp3(R.string.premium_weekly_period), 1);
        }
    }

    public static final class auxFixed extends p43 {
        public static final auxFixed c = new auxFixed();

        public auxFixed() {
            super(new rp3(R.string.premium_yearly_period), 6);
        }
    }

    public p43(rp3 rp3Var, int i) {
        this.a = rp3Var;
        this.b = i;
    }
}
