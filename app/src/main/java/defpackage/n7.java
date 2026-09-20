package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n7<Inputs, Events, State> {
    public final s7<Inputs, Events, State> a;

    public static final class CQf<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Events b;

        public CQf(s7<Inputs, Events, State> s7Var, Events events) {
            super(s7Var);
            this.b = events;
        }

        public final String toString() {
            return "Event handled successfully: " + this.b;
        }
    }

    public static final class EQ<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;

        public EQ(s7<Inputs, Events, State> s7Var, Inputs inputs) {
            super(s7Var);
            this.b = inputs;
        }

        public final String toString() {
            return "Input handled successfully: " + this.b;
        }
    }

    public static final class F1<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Events b;
        public final Throwable c;

        public F1(s7<Inputs, Events, State> s7Var, Events events, Throwable th) {
            super(s7Var);
            this.b = events;
            this.c = th;
        }

        public final String toString() {
            return "Error handling event: " + this.b + " (" + this.c.getMessage() + ')';
        }
    }

    public static final class FJCM<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;
        public final Throwable c;

        public FJCM(s7<Inputs, Events, State> s7Var, Inputs inputs, Throwable th) {
            super(s7Var);
            this.b = inputs;
            this.c = th;
        }

        public final String toString() {
            return "Error handling input: " + this.b + " (" + this.c.getMessage() + ')';
        }
    }

    public static final class LPt6Fixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final String b;
        public final gk4.QnHx c;
        public final Throwable d;

        public LPt6Fixed(s7<Inputs, Events, State> s7Var, String str, gk4.QnHx qnHx, Throwable th) {
            super(s7Var);
            this.b = str;
            this.c = qnHx;
            this.d = th;
        }

        public final String toString() {
            return "Error in sideJob: " + this.b + " (" + this.d.getMessage() + ')';
        }
    }

    public static final class LPt8Fixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public LPt8Fixed(s7<Inputs, Events, State> s7Var) {
            super(s7Var);
        }

        public final String toString() {
            return "Event processing started";
        }
    }

    public static final class LPt9Fixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final State b;

        public LPt9Fixed(s7<Inputs, Events, State> s7Var, State state) {
            super(s7Var);
            this.b = state;
        }

        public final String toString() {
            return "State changed: " + this.b;
        }
    }

    public static final class MZ<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final String b;
        public final gk4.QnHx c;

        public MZ(s7<Inputs, Events, State> s7Var, String str, gk4.QnHx qnHx) {
            super(s7Var);
            this.b = str;
            this.c = qnHx;
        }

        public final String toString() {
            return "sideJob finished: " + this.b;
        }
    }

    public static final class NUlFixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public NUlFixed(s7<Inputs, Events, State> s7Var) {
            super(s7Var);
        }

        public final String toString() {
            return "Event processing stopped";
        }
    }

    public static final class PRnFixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;

        public PRnFixed(s7<Inputs, Events, State> s7Var, Inputs inputs) {
            super(s7Var);
            this.b = inputs;
        }

        public final String toString() {
            return "Input Queued: " + this.b;
        }
    }

    public static final class QnHx<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Events b;

        public QnHx(s7<Inputs, Events, State> s7Var, Events events) {
            super(s7Var);
            this.b = events;
        }

        public final String toString() {
            return "Emitting event: " + this.b;
        }
    }

    public static final class RBi<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final String b;
        public final gk4.QnHx c;

        public RBi(s7<Inputs, Events, State> s7Var, String str, gk4.QnHx qnHx) {
            super(s7Var);
            this.b = str;
            this.c = qnHx;
        }

        public final String toString() {
            return "sideJob cancelled: " + this.b;
        }
    }

    public static final class SjP<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public SjP(s7<Inputs, Events, State> s7Var) {
            super(s7Var);
        }

        public final String toString() {
            return "ViewModel started: " + this.a;
        }
    }

    public static final class T23<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;

        public T23(s7<Inputs, Events, State> s7Var, Inputs inputs) {
            super(s7Var);
            this.b = inputs;
        }

        public final String toString() {
            return "Input cancelled: " + this.b;
        }
    }

    public static final class Xn1<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final String b;

        public Xn1(s7<Inputs, Events, State> s7Var, String str) {
            super(s7Var);
            this.b = str;
        }

        public final String toString() {
            return "sideJob queued: " + this.b;
        }
    }

    public static final class YKK<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Events b;

        public YKK(s7<Inputs, Events, State> s7Var, Events events) {
            super(s7Var);
            this.b = events;
        }

        public final String toString() {
            return "Event Queued: " + this.b;
        }
    }

    public static final class auxFixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;

        public auxFixed(s7<Inputs, Events, State> s7Var, Inputs inputs) {
            super(s7Var);
            this.b = inputs;
        }

        public final String toString() {
            return "Accepting input: " + this.b;
        }
    }

    public static final class byN<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Inputs b;

        public byN(s7<Inputs, Events, State> s7Var, Inputs inputs) {
            super(s7Var);
            this.b = inputs;
        }

        public final String toString() {
            return "Dropping input: " + this.b;
        }
    }

    public static final class ck32<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public ck32(s7<Inputs, Events, State> s7Var) {
            super(s7Var);
        }

        public final String toString() {
            return "ViewModel cleared: " + this.a;
        }
    }

    public static final class lPt3Fixed<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final Throwable b;

        public lPt3Fixed(s7<Inputs, Events, State> s7Var, Throwable th) {
            super(s7Var);
            this.b = th;
        }

        public final String toString() {
            return "Uncaught error (" + this.b.getMessage() + ')';
        }
    }

    public static final class ta<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final String b;
        public final gk4.QnHx c;

        public ta(s7<Inputs, Events, State> s7Var, String str, gk4.QnHx qnHx) {
            super(s7Var);
            this.b = str;
            this.c = qnHx;
        }

        public final String toString() {
            int iOrdinal = this.c.ordinal();
            String str = this.b;
            if (iOrdinal == 0) {
                return b70.a("sideJob started: ", str);
            }
            if (iOrdinal == 1) {
                return b70.a("sideJob restarted: ", str);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class y<Inputs, Events, State> extends n7<Inputs, Events, State> {
        public final State b;
        public final Inputs c;

        public y(s7<Inputs, Events, State> s7Var, State state, Inputs inputs) {
            super(s7Var);
            this.b = state;
            this.c = inputs;
        }

        public final String toString() {
            return "Rejecting input: " + this.c;
        }
    }

    public n7() {
        throw null;
    }

    public n7(s7 s7Var) {
        this.a = s7Var;
    }
}
