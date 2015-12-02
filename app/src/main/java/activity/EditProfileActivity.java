package activity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dryogi.R;

import java.util.Calendar;

public class EditProfileActivity extends AppCompatActivity {

    ImageView pickimageimg, editbloodimg, editbirthimg, editlocationimg, editphoneimg,profileimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


        pickimageimg = (ImageView) findViewById(R.id.pickimageimg);
        editbloodimg = (ImageView) findViewById(R.id.editbloodimg);
        editbirthimg = (ImageView) findViewById(R.id.editbirthimg);
        editlocationimg = (ImageView) findViewById(R.id.editlocationimg);
        editphoneimg = (ImageView) findViewById(R.id.editphoneimg);
        profileimg = (ImageView) findViewById(R.id.profileimg);


        editphoneimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddMobileActivity.class);
                startActivity(intent);
            }
        });

        pickimageimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickimage();
            }
        });


        editbloodimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bloodtype();
            }
        });


        editbirthimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDate();
            }
        });

        editlocationimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choosecity();
            }
        });


    }

    private void choosecity() {

        Intent intent = new Intent(getApplicationContext(), SelectCityActivity.class);
        intent.putExtra("class", "inner");
        startActivity(intent);


    }

    private void selectDate() {

        Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("the selected " + mDay);
        DatePickerDialog dialog = new DatePickerDialog(EditProfileActivity.this,
                new DateSetListener(), mYear, mMonth, mDay);
        dialog.show();


    }

    private void bloodtype() {
        new MaterialDialog.Builder(this)
                .title("Choose blood group")
                .items(R.array.bloodgroup)
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        /**
                         * If you use alwaysCallSingleChoiceCallback(), which is discussed below,
                         * returning false here won't allow the newly selected radio button to actually be selected.
                         **/
                        return true;
                    }
                })
                .positiveText("OK")
                .show();


    }

    private void pickimage() {
        new MaterialDialog.Builder(this)
                .title("Choose image from")
                .items(R.array.optionitems)
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        /**
                         * If you use alwaysCallSingleChoiceCallback(), which is discussed below,
                         * returning false here won't allow the newly selected radio button to actually be selected.
                         **/

                        if (which == 0) {

                            Intent pickPhoto = new Intent(Intent.ACTION_PICK,
                                    android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                            startActivityForResult(pickPhoto, 1);//one can be replaced with any action code

                        } else if (which == 1) {

                            Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            startActivityForResult(takePicture, 0);//zero can be replaced with any action code

                        }
                        return true;
                    }
                })
                .positiveText("OK")
                .show();


    }


    class DateSetListener implements DatePickerDialog.OnDateSetListener {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            // getCalender();
            int mYear = year;
            int mMonth = monthOfYear;
            int mDay = dayOfMonth;
//            v.setText(new StringBuilder()
//                    // Month is 0 based so add 1
//                    .append(mMonth + 1).append("/").append(mDay).append("/")
//                    .append(mYear).append(" "));
//            System.out.println(v.getText().toString());


        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        switch(requestCode) {
            case 0:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = imageReturnedIntent.getData();
                    profileimg.setImageURI(selectedImage);
                }
                break;
            case 1:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = imageReturnedIntent.getData();
                    profileimg.setImageURI(selectedImage);
                }
                break;
        }
    }


}
