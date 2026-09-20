package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class hf0 extends BaseAdapter {
    public static final int z;
    public final Calendar w;
    public final int x;
    public final int y;

    static {
        z = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public hf0() {
        Calendar calendarD = lf5.d(null);
        this.w = calendarD;
        this.x = calendarD.getMaximum(7);
        this.y = calendarD.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.x;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.x;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.y;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.y;
        int i3 = this.x;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.w;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, z, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
