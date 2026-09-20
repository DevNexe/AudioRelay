package defpackage;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.LPt8Fixed;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u23<S> extends Fragment {
    public final LinkedHashSet<wu2<S>> o0 = new LinkedHashSet<>();

    public boolean N(LPt8Fixed.F1 f1) {
        return this.o0.add(f1);
    }
}
