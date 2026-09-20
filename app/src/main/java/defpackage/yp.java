package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yp {
    public final Context a;
    public final NumberFormat b;
    public final NumberFormat c;

    public yp(Context context, Locale locale) {
        this.a = context;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.b = numberFormat;
        NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
        numberFormat2.setMaximumFractionDigits(0);
        numberFormat2.setMinimumFractionDigits(0);
        numberFormat2.setRoundingMode(RoundingMode.HALF_UP);
        this.c = numberFormat2;
    }

    public final aq a(float f) {
        Context context = this.a;
        return new aq(f, f >= 1000.0f ? context.getString(R.string.running_stats_seconds, this.b.format(Float.valueOf(f))) : context.getString(R.string.running_stats_milliseconds, this.c.format(Float.valueOf(f))));
    }
}
