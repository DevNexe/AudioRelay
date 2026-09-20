package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.azefsw.audioconnect.R;
import defpackage.OW8;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] D;
    public final String E;

    public static final class QnHx implements Preference.QnHx<ListPreference> {
        public static QnHx a;

        @Override // androidx.preference.Preference.QnHx
        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            listPreference.getClass();
            if (TextUtils.isEmpty(null)) {
                return listPreference.w.getString(R.string.not_set);
            }
            return null;
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OW8.A, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.D = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (QnHx.a == null) {
                QnHx.a = new QnHx();
            }
            this.C = QnHx.a;
            c();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, OW8.C, i, 0);
        this.E = zb5.g(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        Preference.QnHx qnHx = this.C;
        if (qnHx != null) {
            return qnHx.a(this);
        }
        CharSequence charSequenceE = e();
        CharSequence charSequenceA = super.a();
        String str = this.E;
        if (str == null) {
            return charSequenceA;
        }
        Object[] objArr = new Object[1];
        if (charSequenceE == null) {
            charSequenceE = "";
        }
        objArr[0] = charSequenceE;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceA)) {
            return charSequenceA;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence e() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zb5.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
