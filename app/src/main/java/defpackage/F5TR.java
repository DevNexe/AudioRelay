package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class F5TR implements xT {
    public final Context a;
    public final ry4 b = new ry4(new QnHx());
    public final ry4 c = new ry4(new NUlFixed());
    public final ry4 d = new ry4(new LPt8Fixed());
    public final ry4 e = new ry4(new F1());
    public final ry4 f = new ry4(new CQf());

    public static final class CQf extends cx1 implements h81<Boolean> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final Boolean invoke() {
            if (Build.VERSION.SDK_INT < 23) {
                a62.a.j("has_audio_pro", "false");
                return Boolean.FALSE;
            }
            Boolean boolValueOf = Boolean.valueOf(F5TR.this.a.getPackageManager().hasSystemFeature("android.hardware.audio.pro"));
            a62.a.j("has_audio_pro", String.valueOf(boolValueOf.booleanValue()));
            return boolValueOf;
        }
    }

    public static final class F1 extends cx1 implements h81<Boolean> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final Boolean invoke() {
            Boolean boolValueOf = Boolean.valueOf(F5TR.this.a.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency"));
            a62.a.j("has_low_latency", String.valueOf(boolValueOf.booleanValue()));
            return boolValueOf;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<Integer> {
        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            F5TR f5tr = F5TR.this;
            try {
                int iIntValue = ((Integer) ((AudioManager) f5tr.a.getSystemService("audio")).getClass().getMethod("getOutputLatency", Integer.TYPE).invoke((AudioManager) f5tr.a.getSystemService("audio"), 3)).intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                numValueOf.intValue();
                a62.a.j("output_latency", String.valueOf(iIntValue));
                return numValueOf;
            } catch (Exception unused) {
                a62.a.j("output_latency", "unknown");
                return null;
            }
        }
    }

    public static final class NUlFixed extends cx1 implements h81<Integer> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            String property = ((AudioManager) F5TR.this.a.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                a62.a.j("sample_rate", property);
                return Integer.valueOf(Integer.parseInt(property));
            }
            a62.a.j("sample_rate", "unknown");
            return 48000;
        }
    }

    public static final class QnHx extends cx1 implements h81<Integer> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Integer invoke() {
            String property = ((AudioManager) F5TR.this.a.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            if (property != null) {
                a62.a.j("frames_per_buffer", property);
                return Integer.valueOf(Integer.parseInt(property));
            }
            a62.a.j("frames_per_buffer", "unknown");
            return Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
        }
    }

    public F5TR(Context context) {
        this.a = context;
    }

    @Override // defpackage.xT
    public final int a() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // defpackage.xT
    public final int b() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // defpackage.xT
    public final boolean c() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    @Override // defpackage.xT
    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // defpackage.xT
    public final Integer getLatency() {
        return (Integer) this.d.getValue();
    }
}
