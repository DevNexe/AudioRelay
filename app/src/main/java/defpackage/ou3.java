package defpackage;

import com.azefsw.audioconnect.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ou3 {
    public static final ry4 d = new ry4(NUlFixed.w);
    public final String a;
    public final String b;
    public final boolean c;

    public static final class CQf extends ou3 {
        public static final CQf e = new CQf();

        public CQf() {
            super("audioOutputSettings", "AUDIO_OUTPUT_SETTINGS", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(722015017);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_audio_output_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class EQ extends ou3 {
        public static final EQ e = new EQ();

        public EQ() {
            super("nameEditor", "NAME_EDITOR", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(-1701178556);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_name_editor_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class F1 extends ou3 {
        public static final F1 e = new F1();

        public F1() {
            super("audioQualitySettings", "AUDIO_QUALITY_SETTINGS", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(-1967862027);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_audio_quality_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class FJCM extends ou3 {
        public static final FJCM e = new FJCM();

        public FJCM() {
            super("premium", "PREMIUM", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(1628239302);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_premium_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class LPt8Fixed extends ou3 {
        public static final LPt8Fixed e = new LPt8Fixed();

        public LPt8Fixed() {
            super("bufferSize", "BUFFER_SIZE_MODE", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(683235917);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_buffer_size_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<Map<String, ? extends ou3>> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Map<String, ? extends ou3> invoke() {
            List listM = ps0.M(byN.e, FJCM.e, auxFixed.e, EQ.e, LPt8Fixed.e, YKK.e, F1.e, QnHx.e, CQf.e, T23.e, PRnFixed.e);
            int iA = C0239D.A(mu.w0(listM, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : listM) {
                linkedHashMap.put(((ou3) obj).a, obj);
            }
            return linkedHashMap;
        }
    }

    public static final class PRnFixed extends ou3 {
        public static final PRnFixed e = new PRnFixed();

        public PRnFixed() {
            super("themePicker", "THEME_PICKER", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(1498118761);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_theme_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class QnHx extends ou3 {
        public static final QnHx e = new QnHx();

        public QnHx() {
            super("audioFocusSettings", "AUDIO_FOCUS_SETTINGS", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(831418126);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_audio_focus_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class T23 extends ou3 {
        public static final T23 e = new T23();

        public T23() {
            super("languagePicker", "LANGUAGE_PICKER", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(27296242);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_language_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class YKK extends ou3 {
        public static final YKK e = new YKK();

        public YKK() {
            super("customBufferSizeSettings", "CUSTOM_BUFFER_SIZE", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(1299450206);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.nav_buffer_size_title, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public static final class auxFixed extends ou3 {
        public static final auxFixed e = new auxFixed();

        public auxFixed() {
            super("fullscreen", "FULLSCREEN", true);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(2122132772);
            e40.CQf cQf = e40.a;
            g30Var.G();
            return null;
        }
    }

    public static final class byN extends ou3 {
        public static final byN e = new byN();

        public byN() {
            super("main?destinationId={destinationId}", "MAIN", false);
        }

        @Override // defpackage.ou3
        public final String a(g30 g30Var) {
            g30Var.e(-959946590);
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.app_name, g30Var);
            g30Var.G();
            return strX;
        }
    }

    public ou3(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public abstract String a(g30 g30Var);
}
