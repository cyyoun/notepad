package project.web.notepad.domain.folder;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "t_folder")
public class FolderBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folder_id")
    private Long id;

    private String name;
    private Integer depth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private FolderBean parent;

}
