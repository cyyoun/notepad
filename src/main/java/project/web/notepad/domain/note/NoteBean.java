package project.web.notepad.domain.note;

import jakarta.persistence.*;
import lombok.Getter;
import project.web.notepad.domain.folder.FolderBean;
import project.web.notepad.domain.user.UserBean;

@Getter
@Entity
@Table(name = "t_note")
public class NoteBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Long id;
    private String title;
    private String content;
    private String regDate;
    private String reminder;
    private String lastEditDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserBean userId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folder_id")
    private FolderBean folderId;
}
